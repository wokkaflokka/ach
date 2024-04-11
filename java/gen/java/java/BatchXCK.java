// Code generated by gobind. DO NOT EDIT.

// Java class java.BatchXCK is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/moov-io/ach/java
package java;

import go.Seq;

public final class BatchXCK implements Seq.Proxy {
	static { Java.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	BatchXCK(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public BatchXCK() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	// skipped field BatchXCK.Batch with unsupported type: github.com/moov-io/ach.Batch
	
	// skipped method BatchXCK.AddADVEntry with unsupported parameter or return types
	
	// skipped method BatchXCK.AddEntry with unsupported parameter or return types
	
	public native String category();
	public native void create() throws Exception;
	// skipped method BatchXCK.Equal with unsupported parameter or return types
	
	// skipped method BatchXCK.Error with unsupported parameter or return types
	
	// skipped method BatchXCK.GetADVControl with unsupported parameter or return types
	
	// skipped method BatchXCK.GetADVEntries with unsupported parameter or return types
	
	// skipped method BatchXCK.GetControl with unsupported parameter or return types
	
	// skipped method BatchXCK.GetEntries with unsupported parameter or return types
	
	// skipped method BatchXCK.GetHeader with unsupported parameter or return types
	
	public native String id();
	public native boolean isADV();
	public native byte[] marshalJSON() throws Exception;
	// skipped method BatchXCK.SetADVControl with unsupported parameter or return types
	
	// skipped method BatchXCK.SetControl with unsupported parameter or return types
	
	// skipped method BatchXCK.SetHeader with unsupported parameter or return types
	
	public native void setID(String id);
	// skipped method BatchXCK.SetValidation with unsupported parameter or return types
	
	public native void unmarshalJSON(byte[] p0) throws Exception;
	// skipped method BatchXCK.ValidAmountForCodes with unsupported parameter or return types
	
	// skipped method BatchXCK.ValidTranCodeForServiceClassCode with unsupported parameter or return types
	
	public native void validate() throws Exception;
	// skipped method BatchXCK.WithOffset with unsupported parameter or return types
	
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof BatchXCK)) {
		    return false;
		}
		BatchXCK that = (BatchXCK)o;
		// skipped field BatchXCK.Batch with unsupported type: github.com/moov-io/ach.Batch
		
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("BatchXCK").append("{");
		return b.append("}").toString();
	}
}

