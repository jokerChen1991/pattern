package com.jokerchen.pattern.structure.filter;

import java.util.List;

/**
 * 过滤器模式（Filter Pattern）又可称为标准模式（Criteria Pattern）
 * @author joker
 * @date 2018-09-27 21:32
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
