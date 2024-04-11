// Code generated by gobind. DO NOT EDIT.

// Java class java.BatchMTE is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/moov-io/ach/java
package java;

import go.Seq;

public final class BatchMTE implements Seq.Proxy {
	static { Java.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	BatchMTE(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public BatchMTE() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	// skipped field BatchMTE.Batch with unsupported type: github.com/moov-io/ach.Batch
	
	// skipped method BatchMTE.AddADVEntry with unsupported parameter or return types
	
	// skipped method BatchMTE.AddEntry with unsupported parameter or return types
	
	public native String category();
	public native void create() throws Exception;
	// skipped method BatchMTE.Equal with unsupported parameter or return types
	
	// skipped method BatchMTE.Error with unsupported parameter or return types
	
	// skipped method BatchMTE.GetADVControl with unsupported parameter or return types
	
	// skipped method BatchMTE.GetADVEntries with unsupported parameter or return types
	
	// skipped method BatchMTE.GetControl with unsupported parameter or return types
	
	// skipped method BatchMTE.GetEntries with unsupported parameter or return types
	
	// skipped method BatchMTE.GetHeader with unsupported parameter or return types
	
	public native String id();
	public native boolean isADV();
	public native byte[] marshalJSON() throws Exception;
	// skipped method BatchMTE.SetADVControl with unsupported parameter or return types
	
	// skipped method BatchMTE.SetControl with unsupported parameter or return types
	
	// skipped method BatchMTE.SetHeader with unsupported parameter or return types
	
	public native void setID(String id);
	// skipped method BatchMTE.SetValidation with unsupported parameter or return types
	
	public native void unmarshalJSON(byte[] p0) throws Exception;
	// skipped method BatchMTE.ValidAmountForCodes with unsupported parameter or return types
	
	// skipped method BatchMTE.ValidTranCodeForServiceClassCode with unsupported parameter or return types
	
	public native void validate() throws Exception;
	// skipped method BatchMTE.WithOffset with unsupported parameter or return types
	
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof BatchMTE)) {
		    return false;
		}
		BatchMTE that = (BatchMTE)o;
		// skipped field BatchMTE.Batch with unsupported type: github.com/moov-io/ach.Batch
		
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("BatchMTE").append("{");
		return b.append("}").toString();
	}
}

