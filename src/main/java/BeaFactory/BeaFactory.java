package BeaFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登录注册单例模式
 * 例如 初始化ioc 容器
 */
public class BeaFactory {
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    private  static  Object getBean(String className){
        if (ioc.containsKey(className)){
            return ioc.get(className);
        }else{
            try {
                Object obj =  Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
