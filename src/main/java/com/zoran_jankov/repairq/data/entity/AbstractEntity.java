package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

/** 
 * Abstract class AbstractEntity represents a basic data entity, 
 * and it is a superclass for all other data entities in the data 
 * structure. All data entities have unique ID number, an (int) field,
 * they inherit that from this class, together with getter and setter 
 * method for that field.
 * <p>
 * Field:
 * <p>
 * (int) number - must be unique
 * <p>
 * @author Zoran Jankov
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Entity
{
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	public String getDisplayName()
	{
		return Integer.toString(id);
	}
}