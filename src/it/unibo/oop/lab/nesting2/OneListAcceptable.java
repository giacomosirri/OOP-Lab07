package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> acceptableElements;
	
	public OneListAcceptable(List<T> elements) {
		this.acceptableElements = elements;
	}

	@Override
	public Acceptor<T> acceptor() {
		return this.new OneListAcceptor();
	}

	private class OneListAcceptor implements Acceptor<T> {

		private int nextAcceptableIndex = 0;
		
		private void incrementIndex() {
			this.nextAcceptableIndex++;
		}
		
		private int lastIndex() {
			return OneListAcceptable.this.acceptableElements.size() - 1;
		}
		
		@Override
		public void accept(T newElement) throws Acceptor.ElementNotAcceptedException {
			if (nextAcceptableIndex <= this.lastIndex() &&
					newElement.equals(OneListAcceptable.this.acceptableElements.get(nextAcceptableIndex))) {
				this.incrementIndex();
			} else {
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}
		}

		@Override
		public void end() throws Acceptor.EndNotAcceptedException {
			if (nextAcceptableIndex <= this.lastIndex()) {
				throw new Acceptor.EndNotAcceptedException();
			}
		}
	}
}
