package com.bigcommerce.catalog.models;

public class HookCreationRequest {

	private final Hook request;

	public static ScopeStep newBuilder() {
		return new Steps();
	}

	public static interface ScopeStep {
		IsActiveStep withScope(final String scope);
	}

	public static interface IsActiveStep {
		DestinationStep withIsActive(final Boolean is_active);
	}

	public static interface DestinationStep {
		BuildStep withDestination(final String destination);
	}

	private HookCreationRequest(final Hook hook) {
		this.request = hook;
	}

	public static interface BuildStep {
		HookCreationRequest build();
	}

	public Hook getRequest() {
		return request;
	}

	private static class Steps implements ScopeStep, IsActiveStep, DestinationStep, BuildStep {

		private final Hook request = new Hook();

		@Override
		public HookCreationRequest build() {
			return new HookCreationRequest(request);
		}

		@Override
		public BuildStep withDestination(String destination) {
			request.setDestination(destination);
			return this;
		}

		@Override
		public DestinationStep withIsActive(Boolean is_active) {
			request.setIs_active(is_active);
			return this;
		}

		@Override
		public IsActiveStep withScope(String scope) {
			request.setScope(scope);
			return this;
		}

	}

}

