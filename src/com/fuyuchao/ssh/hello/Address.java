package com.fuyuchao.ssh.hello;

/**
 * @author fycstart 邮箱: fycstart@126.com
 * @version 2017年09月27
 *          天变不足畏，祖宗不足法，人言不足恤
 */
public class Address {
    private String city;
    private String province;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
