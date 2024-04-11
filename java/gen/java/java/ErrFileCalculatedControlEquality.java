// Code generated by gobind. DO NOT EDIT.

// Java class java.ErrFileCalculatedControlEquality is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/moov-io/ach/java
package java;

import go.Seq;

public final class ErrFileCalculatedControlEquality implements Seq.Proxy {
	static { Java.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	ErrFileCalculatedControlEquality(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public ErrFileCalculatedControlEquality() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public final native String getMessage();
	public final native void setMessage(String v);
	
	public final native String getField();
	public final native void setField(String v);
	
	public final native long getCalculatedValue();
	public final native void setCalculatedValue(long v);
	
	public final native long getControlValue();
	public final native void setControlValue(long v);
	
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof ErrFileCalculatedControlEquality)) {
		    return false;
		}
		ErrFileCalculatedControlEquality that = (ErrFileCalculatedControlEquality)o;
		String thisMessage = getMessage();
		String thatMessage = that.getMessage();
		if (thisMessage == null) {
			if (thatMessage != null) {
			    return false;
			}
		} else if (!thisMessage.equals(thatMessage)) {
		    return false;
		}
		String thisField = getField();
		String thatField = that.getField();
		if (thisField == null) {
			if (thatField != null) {
			    return false;
			}
		} else if (!thisField.equals(thatField)) {
		    return false;
		}
		long thisCalculatedValue = getCalculatedValue();
		long thatCalculatedValue = that.getCalculatedValue();
		if (thisCalculatedValue != thatCalculatedValue) {
		    return false;
		}
		long thisControlValue = getControlValue();
		long thatControlValue = that.getControlValue();
		if (thisControlValue != thatControlValue) {
		    return false;
		}
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {getMessage(), getField(), getCalculatedValue(), getControlValue()});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ErrFileCalculatedControlEquality").append("{");
		b.append("Message:").append(getMessage()).append(",");
		b.append("Field:").append(getField()).append(",");
		b.append("CalculatedValue:").append(getCalculatedValue()).append(",");
		b.append("ControlValue:").append(getControlValue()).append(",");
		return b.append("}").toString();
	}
}

