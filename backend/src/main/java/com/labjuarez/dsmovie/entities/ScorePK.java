package com.labjuarez.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class ScorePK implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Movie movie;

}
