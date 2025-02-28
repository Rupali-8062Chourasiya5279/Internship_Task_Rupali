package embedingobject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
public class Certificate {
	private int duration;
	private String cname;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate( int duration,String cname) {
		super();
		this.duration=duration;
		this.cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setNo(int duration) {
		this.duration = duration;
	}

	public String getName() {
		return cname;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Certificate [duration=" + duration + ", name=" + cname + "]";
	}

}
