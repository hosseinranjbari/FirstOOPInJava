package vehicle.car;

import org.junit.jupiter.api.Test;

public class TypeOfGearBoxTest {
    @Test
    void should_print_all_types_of_gearbox_values() {
        TypeOfGearBox.print();
    }

    @Test
    void should_print_all_types_of_gearbox_values_in_persian() {
        TypeOfGearBox.printPersian();
    }
}
