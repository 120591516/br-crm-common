package br.crm.common.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * (获取controller中requestMapping的value值)
 * 
 * @ClassName: GetRequestMappingName
 * @Description: TODO
 * @author 王文腾
 * @date 2017年2月24日 下午1:54:42
 */
public class GetRequestMappingName {

    /** 
    * @Title: getControllerName 
    * @Description: 获取controller的requestMapping值
    * @param clazz
    * @return    设定文件 
    * @return String    返回类型 
    */
    public static String getControllerName(Class<?> clazz) {
        String controllerName = null;
        boolean controller = clazz.isAnnotationPresent(RequestMapping.class);
        if (controller) {
            RequestMapping requestMapping = clazz.getAnnotation(RequestMapping.class);
            //获取controller中requestMapping的value
            controllerName = requestMapping.value()[0];
        }
        return controllerName;
    }

    /** 
    * @Title: getMethodName 
    * @Description: 通过反射得到方法中requestMapping的value值
    * @param clazz
    * @return    设定文件 
    * @return List<String>    返回类型 
    */
    public static List<String> getMethodName(Class<?> clazz) {
        List<String> list = new ArrayList<>();
        //得到方法
        Method[] methods = clazz.getDeclaredMethods();
        String methodName = null;
        for (Method method : methods) {
            //判断是方法否存在requestMapping注释
            boolean present = method.isAnnotationPresent(RequestMapping.class);
            if (present) {
                //得到requestMapping注释
                RequestMapping annotation = method.getAnnotation(RequestMapping.class);
                //输出 annotation RequestMapping包含的信息(headers=[], name=, path=[], value=[toTicket], produces=[], method=[], params=[], consumes=[])
                //System.err.println(annotation);
                //得到value数组
                methodName = annotation.value()[0];
                list.add(methodName);
            }
        }
        return list;
    }
}
