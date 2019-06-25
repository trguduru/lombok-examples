package io.tguduru.lombok;

import java.util.Objects;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-06-25
 */
@Getter
@EqualsAndHashCode
@ToString
@Builder(builderClassName = "Builder",buildMethodName = "build")
public class Customer {
    private long id;
    private String name;

    static class Builder {
        Customer build() {
            if (id < 0) {
                throw new RuntimeException("Invaid id");
            }
            if (Objects.isNull(name)) {
                throw new RuntimeException("name is null");
            }
            return new Customer(id, name);
        }
    }
}
