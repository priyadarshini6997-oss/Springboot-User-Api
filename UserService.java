package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public UserResponseDto createUser(UserRequestDto dto)
	{
		if(userRepository.existsByEmail(dto.getEmail())) {
			throw new RuntimeException("Email already exists");
		}
		User user = UserMapper.toEntity(dto);
		User savedUser = userRepository.save(user);
		return UserMapper.toDto(savedUser);
	}

}
