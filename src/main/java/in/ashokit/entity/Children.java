package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = " DC_CHILDRENS")
@Data
public class Children {

	@Id
	private Integer chaildrenID;
	private Integer caseNum;		
	private Integer childrenDob;	
	private Integer childrenSSN;	
}
