/*
package cn.freeprogramming.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Method;

*/
/**
 * @author humorchen
 * @date 2021/12/6 21:42
 *//*


@Activate(group = Constants.PROVIDER)
@Slf4j
public class ExceptionFilter implements Filter {


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = null;
        try {
            result = invoker.invoke(invocation);
            Method method = invoker.getInterface().getMethod(invocation.getMethodName(), invocation.getParameterTypes());
            Class returnType = method.getReturnType();
            if (result.hasException()) {
                Throwable throwable = result.getException();
                if (returnType.getName().equals("com.liwen.domain.Result")) {
                    com.liwen.domain.Result myResult;
                    if (throwable instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException) {
                        myResult = ResultUtils.wrapFailure(0, "重复操作");
                    } else {
                        myResult = ResultUtils.wrapFailure(1, "系统错误");
                    }
                    log.error("服务异常 myResult=" + myResult, result);
                    return new RpcResult(myResult);
                }
            }
        } catch (Exception e) {
            log.error("统一捕捉异常失败", e);
        }
        return result;
    }
}
*/
