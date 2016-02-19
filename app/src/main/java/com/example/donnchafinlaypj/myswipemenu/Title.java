/*
 * Created on 19/02/16, 15:39
 *
 * Copyright(c) 2016 PagesJaunes, SoLocal Group - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited. Proprietary and confidential
 *
 */
package com.example.donnchafinlaypj.myswipemenu;

/**
 * //TODO : Add a class header comments
 * <p/>
 * created on 19/02/16
 *
 * @author donnchafinlaypj
 * @version //TODO : add version
 */
public class Title
{
	public String getName()
	{
		return name;
	}

	public String getDist()
	{
		return dist;
	}

	String name;
	String dist;

	public Title(String dist, String name)
	{
		this.dist = dist;
		this.name = name;
	}

	public void setDist(String dist)
	{
		this.dist = dist;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
