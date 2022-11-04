package com.lixiaoxin.common.utils;


import com.lixiaoxin.common.Result;
import com.lixiaoxin.common.enums.ResultCode;
/**
 * @Author: Hutengfei
 * @Description:
 * @Date Create in 2019/7/22 19:52
 */
public class ResultTool {
    public static Result success() {
        return new Result(true);
    }

    public static <T> Result<T> success(T data) {
        return new Result(true, data);
    }

    public static Result fail() {
        return new Result(false);
    }

    public static Result fail(ResultCode resultEnum) {
        return new Result(false, resultEnum);
    }
}
