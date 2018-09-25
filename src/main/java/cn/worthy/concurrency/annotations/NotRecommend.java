package cn.worthy.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***************************************************************************
 * @Description - 不推荐写法
 *
 * @author yaowx001 2018/9/25
 * @version 1.0
 **************************************************************************/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {


    String value() default "";

}
