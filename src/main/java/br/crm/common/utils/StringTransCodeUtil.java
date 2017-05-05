package br.crm.common.utils;

import java.lang.reflect.Field;

public class StringTransCodeUtil {
    public static Object transCode(Object object) throws Exception{
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if(field.get(object)!=null){
                Class<?> type = field.getType();
                if(field.getType().equals(String.class)){
                    String obj = (String) field.get(object);
                    String str = new String(obj.getBytes("ISO-8859-1"), "UTF-8");
                    field.set(object, str);
                }
            }
        }
        
        return object;
    }
}
