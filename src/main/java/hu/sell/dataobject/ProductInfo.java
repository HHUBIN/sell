package hu.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.sell.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * Created by 廖师兄
 * 2017-05-09 11:30
 */
@Entity
@Data
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 6399186181668983148L;

    @Id
    private String productId;

    /**
     * 名字.
     */
    private String productName;

    /**
     * 单价.
     */
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    private Integer productStock;

    /**
     * 描述.
     */
    private String productDescription;

    private Integer categoryType;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 状态, 0正常1下架.
     */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /**
     * 图片链接加host拼接成完整 url
     *
     * @param host
     * @return
     */
    public ProductInfo addImageHost(String host) {
        if(productIcon.startsWith("//") || productIcon.startsWith("http")) {
            return this;
        }

        if(!host.startsWith("http")) {
            host = "//" + host;
        }
        if(!host.endsWith("/")) {
            host = host + "/";
        }
        productIcon = host + productIcon;
        return this;
    }
}
