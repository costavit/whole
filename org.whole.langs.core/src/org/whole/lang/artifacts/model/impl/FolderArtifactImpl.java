package org.whole.lang.artifacts.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.artifacts.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.artifacts.reflect.ArtifactsEntityDescriptorEnum;
import org.whole.lang.artifacts.visitors.IArtifactsVisitor;
import org.whole.lang.artifacts.reflect.ArtifactsFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class FolderArtifactImpl extends AbstractSimpleEntity implements
		FolderArtifact {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<FolderArtifact> wGetEntityDescriptor() {
		return ArtifactsEntityDescriptorEnum.FolderArtifact;
	}

	public int wGetEntityOrd() {
		return ArtifactsEntityDescriptorEnum.FolderArtifact_ord;
	}

	public void accept(IArtifactsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private FolderName name;

	public FolderName getName() {
		return notifyRequested(ArtifactsFeatureDescriptorEnum.name, name);
	}

	public void setName(FolderName name) {
		notifyChanged(ArtifactsFeatureDescriptorEnum.name, this.name,
				this.name = name);
	}

	private Metadata metadata;

	public Metadata getMetadata() {
		return notifyRequested(ArtifactsFeatureDescriptorEnum.metadata,
				metadata);
	}

	public void setMetadata(Metadata metadata) {
		notifyChanged(ArtifactsFeatureDescriptorEnum.metadata, this.metadata,
				this.metadata = metadata);
	}

	private Artifacts artifacts;

	public Artifacts getArtifacts() {
		return notifyRequested(ArtifactsFeatureDescriptorEnum.artifacts,
				artifacts);
	}

	public void setArtifacts(Artifacts artifacts) {
		notifyChanged(ArtifactsFeatureDescriptorEnum.artifacts, this.artifacts,
				this.artifacts = artifacts);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getMetadata().wGetAdaptee(false);
		case 2:
			return getArtifacts().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(ArtifactsEntityDescriptorEnum.FolderName));
			break;
		case 1:
			setMetadata(value
					.wGetAdapter(ArtifactsEntityDescriptorEnum.Metadata));
			break;
		case 2:
			setArtifacts(value
					.wGetAdapter(ArtifactsEntityDescriptorEnum.Artifacts));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
