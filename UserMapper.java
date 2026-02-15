package com.example.demo;

public class UserMapper {
	public static User toEntity(UserRequestDto dto)
	{
		User user = new User();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		return user;
	}
	public static UserResponseDto toDto(User user)
	{
		return new UserResponseDto(
				user.getId(),
				user.getName(),
				user.getEmail()
				);
	}

}
