/***************************************************************************
 * COPYRIGHT (C) 2012, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package org.rapid7.rule;

import java.io.File;

/**
 *
 * @author Daniel Akiva
 */
public interface IRuleProvider
{

   public File getRulesFile();

}
