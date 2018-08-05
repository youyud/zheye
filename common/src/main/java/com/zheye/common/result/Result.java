package com.zheye.common.result;



import com.zheye.common.enums.ErrorEnum;

import java.io.Serializable;

/**
 * 接口返回封装类
 */
public class Result implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6902383220778838424L;
    private Object detail;//返回数据
    private boolean flag;//标识位
    private Integer errCode;//错误码
    private String errDesc;//错误描述

    public Result() {
    }

    public Result(boolean flag, ErrorEnum errorEnum) {
        this.flag = flag;
        if (flag) {
            this.setErrorEnum(ErrorEnum.SUCCESS_0);
        } else {
            this.setErrorEnum(errorEnum);
        }
    }

    public Result(boolean flag, Integer errCode, String errDesc, Object detail) {
        this.flag = flag;
        this.errCode = errCode;
        this.errDesc = errDesc;
        this.detail = detail;
    }

    /**
     * 成功无参数
     *
     * @return
     */
    public static Result ok() {
        return Result.ok(null);
    }

    /**
     * 成功有参数
     *
     * @param detail
     * @return
     */
    public static Result ok(Object detail) {
        return new Result(true, ErrorEnum.SUCCESS_0.getErrorCode(), ErrorEnum.SUCCESS_0.getErrorDesc(), detail);
    }

    /**
     * 错误无参
     *
     * @param
     * @return
     */
    public static Result fail(ErrorEnum errorEnum) {
        return new Result(false, errorEnum.getErrorCode(), errorEnum.getErrorDesc(), null);
    }

    /**
     * 错误有参
     *
     * @param
     * @return
     */
    public static Result fail(ErrorEnum errorEnum,Object detail) {
        return new Result(false, errorEnum.getErrorCode(), errorEnum.getErrorDesc(), detail);
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    public void setErrorEnum(ErrorEnum errorEnum) {
        setErrCode(null == errorEnum ? ErrorEnum.SUCCESS_0.getErrorCode() : errorEnum.getErrorCode());
        setErrDesc(null == errorEnum ? ErrorEnum.SUCCESS_0.getErrorDesc() : errorEnum.getErrorDesc());
    }

}
