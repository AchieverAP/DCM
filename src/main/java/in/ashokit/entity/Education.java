package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_EDUCATION")
@Data
public class Education {

	@Id
	private Integer veduId;					
	private Integer caseNum;					
	private String highestQualification;	
	private Integer NUMBER;
}

