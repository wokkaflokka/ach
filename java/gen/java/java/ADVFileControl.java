// Code generated by gobind. DO NOT EDIT.

// Java class java.ADVFileControl is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/moov-io/ach/java
package java;

import go.Seq;

public final class ADVFileControl implements Seq.Proxy {
	static { Java.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	ADVFileControl(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public ADVFileControl() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public final native String getID();
	public final native void setID(String v);
	
	public final native long getBatchCount();
	public final native void setBatchCount(long v);
	
	public final native long getBlockCount();
	public final native void setBlockCount(long v);
	
	public final native long getEntryAddendaCount();
	public final native void setEntryAddendaCount(long v);
	
	public final native long getEntryHash();
	public final native void setEntryHash(long v);
	
	public final native long getTotalDebitEntryDollarAmountInFile();
	public final native void setTotalDebitEntryDollarAmountInFile(long v);
	
	public final native long getTotalCreditEntryDollarAmountInFile();
	public final native void setTotalCreditEntryDollarAmountInFile(long v);
	
	public native long calculateCheckDigit(String routingNumber);
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof ADVFileControl)) {
		    return false;
		}
		ADVFileControl that = (ADVFileControl)o;
		String thisID = getID();
		String thatID = that.getID();
		if (thisID == null) {
			if (thatID != null) {
			    return false;
			}
		} else if (!thisID.equals(thatID)) {
		    return false;
		}
		long thisBatchCount = getBatchCount();
		long thatBatchCount = that.getBatchCount();
		if (thisBatchCount != thatBatchCount) {
		    return false;
		}
		long thisBlockCount = getBlockCount();
		long thatBlockCount = that.getBlockCount();
		if (thisBlockCount != thatBlockCount) {
		    return false;
		}
		long thisEntryAddendaCount = getEntryAddendaCount();
		long thatEntryAddendaCount = that.getEntryAddendaCount();
		if (thisEntryAddendaCount != thatEntryAddendaCount) {
		    return false;
		}
		long thisEntryHash = getEntryHash();
		long thatEntryHash = that.getEntryHash();
		if (thisEntryHash != thatEntryHash) {
		    return false;
		}
		long thisTotalDebitEntryDollarAmountInFile = getTotalDebitEntryDollarAmountInFile();
		long thatTotalDebitEntryDollarAmountInFile = that.getTotalDebitEntryDollarAmountInFile();
		if (thisTotalDebitEntryDollarAmountInFile != thatTotalDebitEntryDollarAmountInFile) {
		    return false;
		}
		long thisTotalCreditEntryDollarAmountInFile = getTotalCreditEntryDollarAmountInFile();
		long thatTotalCreditEntryDollarAmountInFile = that.getTotalCreditEntryDollarAmountInFile();
		if (thisTotalCreditEntryDollarAmountInFile != thatTotalCreditEntryDollarAmountInFile) {
		    return false;
		}
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {getID(), getBatchCount(), getBlockCount(), getEntryAddendaCount(), getEntryHash(), getTotalDebitEntryDollarAmountInFile(), getTotalCreditEntryDollarAmountInFile()});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ADVFileControl").append("{");
		b.append("ID:").append(getID()).append(",");
		b.append("BatchCount:").append(getBatchCount()).append(",");
		b.append("BlockCount:").append(getBlockCount()).append(",");
		b.append("EntryAddendaCount:").append(getEntryAddendaCount()).append(",");
		b.append("EntryHash:").append(getEntryHash()).append(",");
		b.append("TotalDebitEntryDollarAmountInFile:").append(getTotalDebitEntryDollarAmountInFile()).append(",");
		b.append("TotalCreditEntryDollarAmountInFile:").append(getTotalCreditEntryDollarAmountInFile()).append(",");
		return b.append("}").toString();
	}
}

