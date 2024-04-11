// Code generated by gobind. DO NOT EDIT.

// Java class java.ErrBatchAscending is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/moov-io/ach/java
package java;

import go.Seq;

public final class ErrBatchAscending implements Seq.Proxy {
	static { Java.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	ErrBatchAscending(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public ErrBatchAscending() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public final native String getMessage();
	public final native void setMessage(String v);
	
	// skipped field ErrBatchAscending.PreviousTrace with unsupported type: interface{}
	
	// skipped field ErrBatchAscending.CurrentTrace with unsupported type: interface{}
	
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof ErrBatchAscending)) {
		    return false;
		}
		ErrBatchAscending that = (ErrBatchAscending)o;
		String thisMessage = getMessage();
		String thatMessage = that.getMessage();
		if (thisMessage == null) {
			if (thatMessage != null) {
			    return false;
			}
		} else if (!thisMessage.equals(thatMessage)) {
		    return false;
		}
		// skipped field ErrBatchAscending.PreviousTrace with unsupported type: interface{}
		
		// skipped field ErrBatchAscending.CurrentTrace with unsupported type: interface{}
		
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {getMessage()});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ErrBatchAscending").append("{");
		b.append("Message:").append(getMessage()).append(",");
		return b.append("}").toString();
	}
}

