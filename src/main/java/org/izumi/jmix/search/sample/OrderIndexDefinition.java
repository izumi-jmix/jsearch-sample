package org.izumi.jmix.search.sample;

import io.jmix.search.index.annotation.AutoMappedField;
import io.jmix.search.index.annotation.JmixEntitySearchIndex;
import org.izumi.jmix.search.sample.entity.Order;

@JmixEntitySearchIndex(entity = Order.class)
public interface OrderIndexDefinition {

    @AutoMappedField(includeProperties = {"number", "product", "customer.status", "customer.lastName"})
    void orderMapping();
}
