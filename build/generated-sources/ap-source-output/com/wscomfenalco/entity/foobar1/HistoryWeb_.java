package com.wscomfenalco.entity.foobar1;

import com.wscomfenalco.entity.HistoryWeb;
import com.wscomfenalco.entity.UserWeb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-30T10:51:59")
@StaticMetamodel(HistoryWeb.class)
public class HistoryWeb_ { 

    public static volatile SingularAttribute<HistoryWeb, Integer> id;
    public static volatile SingularAttribute<HistoryWeb, Date> admissionDate;
    public static volatile SingularAttribute<HistoryWeb, UserWeb> userWebId;

}