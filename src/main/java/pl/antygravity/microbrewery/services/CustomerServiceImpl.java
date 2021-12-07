package pl.antygravity.microbrewery.services;

import org.springframework.stereotype.Service;
import pl.antygravity.microbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("John Dow")
                .build();
    }
}
