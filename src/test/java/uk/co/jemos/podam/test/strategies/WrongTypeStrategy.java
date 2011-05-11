/**
 * 
 */
package uk.co.jemos.podam.test.strategies;

import uk.co.jemos.podam.annotations.PodamAttributeStrategy;
import uk.co.jemos.podam.api.AttributeDataStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;
import uk.co.jemos.podam.test.dto.OneDimensionalTestPojo;

/**
 * A dummy strategy to proof the point that when given as type for
 * {@link PodamAttributeStrategy} it will trigger an exception.
 * 
 * @author mtedone
 * 
 */
public class WrongTypeStrategy
		implements
			AttributeDataStrategy<OneDimensionalTestPojo> {

	/**
	 * {@inheritDoc}
	 */
	public OneDimensionalTestPojo getValue() throws PodamMockeryException {
		// WHATEVER!
		return null;
	}

	// ------------------->> Constants

	// ------------------->> Instance / Static variables

	// ------------------->> Constructors

	// ------------------->> Public methods

	// ------------------->> Getters / Setters

	// ------------------->> Private methods

	// ------------------->> equals() / hashcode() / toString()

	// ------------------->> Inner classes

}