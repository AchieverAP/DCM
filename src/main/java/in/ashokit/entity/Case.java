package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CASES")
@Data
public class Case {
	@Id
	private Integer caseId;	
	private Integer caseNo;	
	private Integer applicationId;		
	private Integer planId;		
	
}
