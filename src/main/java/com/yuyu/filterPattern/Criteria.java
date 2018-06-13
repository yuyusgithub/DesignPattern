package com.yuyu.filterPattern;

import java.util.List;

/**
 * Created by 彦祖 .
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
