package hu.sell.exception;

import hu.sell.enums.ResultEnum;

import javax.persistence.criteria.CriteriaBuilder;

public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(String message, Integer code){
        super(message);
        this.code = code;
    }

}
