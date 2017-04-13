package org.solomon.config.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * DruidProperties
 *
 * @author likf
 */
@ConfigurationProperties(prefix = "druid")
@Data
public class DruidProperties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String type;
    private String filters;

    private int initialSize;
    private int maxActive;
    private int minIdle;

    private boolean testOnBorrow;
}
