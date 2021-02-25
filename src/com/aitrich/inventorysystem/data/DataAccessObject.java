package com.aitrich.inventorysystem.data;

import java.util.List;



public interface DataAccessObject {
	void insert(Object object);
	
    Object[] findAll() ;
}
