import com.example.dao.BSDataDao;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

public class a {

    @Test
    public void test1() {
        getReflectAllMethod(BSDataDao.class);
    }


    private static void getReflectAllMethod( Class <?> mLocalClass){

        Class<?> c;
        c = mLocalClass;
        try {
            do{



                Method m[] = c.getDeclaredMethods(); // 取得全部的方法
                for (int i = 0; i < m.length; i++) {
                    String mod = Modifier.toString(m[i].getModifiers()); // 取得访问权限
                    String metName = m[i].getName(); // 取得方法名称
                    Class<?> ret = m[i].getReturnType();// 取得返回值类型
                    Class<?> param[] = m[i].getParameterTypes(); // 得到全部的参数类型
                    Class<?> exc[] = m[i].getExceptionTypes(); // 得到全部的异常
                    System.out.print(mod + " ");//输出每一方法的访问权限
                    System.out.print(ret + " ");//输出每一方法的返回值类型
                    System.out.print(metName + " (");//输出每一方法的名字
                    for (int x = 0; x < param.length; x++) {//循环输出每一方法的参数的类型
                        System.out.print(param[x] + "arg-" + x);
                        if (x < param.length - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.print(") ");
                    if (exc.length > 0) {// 有异常抛出
                        System.out.print("throws ");
                        for (int x = 0; x < exc.length; x++) {//循环输出每一方法所抛出的异常名字
                            System.out.print(exc[x].getName());
                            if (x < param.length - 1) {
                                System.out.print(",");
                            }
                        }
                    }
                    System.out.println();
                }
                c=c.getSuperclass();
            }while(c!=null);
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


