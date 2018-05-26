package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zjx on 2018/5/23.
 */
public class CartVo {
    //作为CartProductVo的一个集合
    private List<CartProductVo> cartProductVoList;
    //购物车内所有产品的总价
    private BigDecimal cartTotalPrice;
    //购物车内产品是否已经都勾选
    private Boolean allChecked;

    private String imageHost;

    public List<CartProductVo> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
