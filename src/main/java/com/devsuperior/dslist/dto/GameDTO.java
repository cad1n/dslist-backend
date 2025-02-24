package com.devsuperior.dslist.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

@Setter
@Getter
public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

}
