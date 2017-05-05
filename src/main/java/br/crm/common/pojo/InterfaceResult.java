package br.crm.common.pojo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * BR-CRM系统自定义响应结构
 *
 */
public class InterfaceResult implements Serializable {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态
	private Integer code;

	// 响应消息
	private String message;

	// 响应中的数据
	private Object data;

	public static InterfaceResult build(Integer code, String message, Object data) {
		return new InterfaceResult(code, message, data);
	}

	public static InterfaceResult ok(Object data) {
		return new InterfaceResult(data);
	}

	public static InterfaceResult ok() {
		return new InterfaceResult(null);
	}

	public InterfaceResult() {

	}

	public static InterfaceResult build(Integer code, String message) {
		return new InterfaceResult(code, message, null);
	}

	public InterfaceResult(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public InterfaceResult(Object data) {
		this.code = 200;
		this.message = "OK";
		this.data = data;
	}

	// ---------getxxx&SetXXX-------------------
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ObjectMapper getMapper() {
		return MAPPER;
	}

	/**
	 * 将json结果集转化为Result对象
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            Result中的object类型
	 * @return
	 */
	public static InterfaceResult formatToPojo(String jsonData, Class<?> clazz) {
		try {
			if (clazz == null) {
				return MAPPER.readValue(jsonData, InterfaceResult.class);
			}
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (clazz != null) {
				if (data.isObject()) {
					obj = MAPPER.readValue(data.traverse(), clazz);
				} else if (data.isTextual()) {
					obj = MAPPER.readValue(data.asText(), clazz);
				}
			}
			return build(jsonNode.get("code").intValue(), jsonNode.get("message").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 没有object对象的转化
	 * 
	 * @param json
	 * @return
	 */
	public static InterfaceResult format(String json) {
		try {
			return MAPPER.readValue(json, InterfaceResult.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Object是集合转化
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            集合中的类型
	 * @return
	 */
	public static InterfaceResult formatToList(String jsonData, Class<?> clazz) {
		try {
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (data.isArray() && data.size() > 0) {
				obj = MAPPER.readValue(data.traverse(),
						MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
			}
			return build(jsonNode.get("code").intValue(), jsonNode.get("message").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}
}
