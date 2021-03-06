/*
 * Copyright (c) 2006 Rick Mugridge, www.RimuResearch.com
 * Released under the terms of the GNU General Public License version 2 or later.
 * Written: 20/08/2006
*/

package fitlibrary.specify.exception;

public class ExceptionThrownByNestedToString {
	public Value value() {
		return new Value();
	}
	public static class Value {
		public Colour getColour() {
			return new Colour();
		}
	}
	public static class Colour {
		public static Colour parse(@SuppressWarnings("unused") String s) {
			return new Colour();
		}
		@Override
		public String toString() {
			throw new ForcedException();
		}
	}
}
