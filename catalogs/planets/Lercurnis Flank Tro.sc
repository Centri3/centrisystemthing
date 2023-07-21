Moon	"Tro/Lercurnis III VII"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.006

	Albedo          0.4
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_tro.cfg"
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank Fatum"
		Height          80
		Density         3.9262
		Pressure        0.0000001
		Greenhouse      5
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			O2        	99.911
			N2        	0.089372
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      22.713728513
	}
}

