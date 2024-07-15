package com.java.dto;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//data=getter & setter 동시에 가져옴
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BoardDto {
	private int bno;
	private String btitle;
	

}
