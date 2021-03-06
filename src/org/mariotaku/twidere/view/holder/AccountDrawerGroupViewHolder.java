package org.mariotaku.twidere.view.holder;

import org.mariotaku.twidere.R;
import org.mariotaku.twidere.view.ColorLabelRelativeLayout;
import org.mariotaku.twidere.view.ProfileImageBannerLayout;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountDrawerGroupViewHolder {

	public final ProfileImageBannerLayout profile_image_banner;
	public final ColorLabelRelativeLayout name_container;
	public final ImageView profile_banner, profile_image;
	public final TextView name, screen_name;
	public final ImageView expand_indicator;
	public final View default_indicator;

	public AccountDrawerGroupViewHolder(final View view) {
		name = (TextView) view.findViewById(R.id.name);
		screen_name = (TextView) view.findViewById(R.id.screen_name);
		name_container = (ColorLabelRelativeLayout) view.findViewById(R.id.name_container);
		profile_image_banner = (ProfileImageBannerLayout) view.findViewById(R.id.profile_image_banner);
		profile_image = (ImageView) profile_image_banner.findViewById(ProfileImageBannerLayout.VIEW_ID_PROFILE_IMAGE);
		profile_banner = (ImageView) profile_image_banner.findViewById(ProfileImageBannerLayout.VIEW_ID_PROFILE_BANNER);
		expand_indicator = (ImageView) view.findViewById(R.id.expand_indicator);
		default_indicator = view.findViewById(R.id.default_indicator);
	}

}
