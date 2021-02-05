package io.erehsawsaltul.springcore.reftypes;

public class Scores {
	private Double physics;
	private Double chemsitry;
	private Double maths;

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemsitry() {
		return chemsitry;
	}

	public void setChemsitry(Double chemsitry) {
		this.chemsitry = chemsitry;
	}

	@Override
	public String toString() {
		return "Scores [physics=" + physics + ", chemsitry=" + chemsitry + ", maths=" + maths + "]";
	}

}
