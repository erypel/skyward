package com.evanrypel.skyward.repository;

public interface ObjectRepository<T>
{
	public String save(T t);
	
	public T retrieve(String id) throws Exception;
}
