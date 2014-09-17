package com.wscomfenalco.entity.foobar2;

import com.wscomfenalco.entity.HistoryWeb;
import com.wscomfenalco.entity.UserWeb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-30T10:51:59")
@StaticMetamodel(UserWeb.class)
public class UserWeb_ { 

    public static volatile SingularAttribute<UserWeb, Integer> id;
    public static volatile SingularAttribute<UserWeb, String> nitCompany;
    public static volatile SingularAttribute<UserWeb, String> username;
    public static volatile SingularAttribute<UserWeb, String> identification;
    public static volatile CollectionAttribute<UserWeb, HistoryWeb> historyWebCollection;
    public static volatile SingularAttribute<UserWeb, String> pass;
    public static volatile SingularAttribute<UserWeb, String> profile;

}