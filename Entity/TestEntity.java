
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
class TestEntity{

    @Id
    @SequenceGenerator(name="coffeeDelivery_seq",sequenceName="coffeeDelivery_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="coffeeDelivery_seq")
    private @NonNull long coffeeDeliveryID;
    private String address;
    private int priece;
    private String coffeeType;


}