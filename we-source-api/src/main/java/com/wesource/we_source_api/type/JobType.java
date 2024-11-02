package com.wesource.we_source_api.type;

public enum JobType {
	
	NEW(1),
	BID(2),
	CONFIRM(3),
	IN_PROGRES(4),
	COMPLETE(5),
	DRAFT(6),
	CANCEL(7);
	
	private Integer value;

	JobType(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
}
