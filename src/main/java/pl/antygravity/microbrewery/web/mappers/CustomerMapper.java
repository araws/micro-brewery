package pl.antygravity.microbrewery.web.mappers;

import org.mapstruct.Mapper;
import pl.antygravity.microbrewery.domain.Customer;
import pl.antygravity.microbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
