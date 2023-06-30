DwarfMoon	"Bors I/Lercurnis B VII B-I"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.0001
	Radius          321.57
	InertiaMoment   0.3975
	RotationPeriod  152.93
	Obliquity       1
	EqAscendNode    -178.63

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_i.cfg"
		SurfStyle       0.14405
		Randomize      (-0.379, -0.361, -0.594)
		colorDistMagn   0.05123
		colorDistFreq   46.966
		detailScale     1024
		drivenDarkening 0
		seaLevel        0.14182
		snowLevel       2
		tropicLatitude  0.017452
		icecapLatitude  2
		icecapHeight    0.45731
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38983
		heightTempGrad  0.625
		beachWidth      0.00092255
		tropicWidth     0.07
		mainFreq        1.8347
		venusFreq       1.3078
		venusMagn       0
		mareFreq        0
		mareDensity     0.15989
		terraceProb     0.43412
		erosion         0
		montesMagn      0.072817
		montesFreq      13.268
		montesSpiky     0.81281
		montesFraction  0.58115
		dunesMagn       0.029348
		dunesFreq       2.4066
		dunesFraction   0.44256
		hillsMagn       0.14946
		hillsFreq       29.606
		hillsFraction   0.96
		hills2Fraction  0
		riversMagn      57.388
		riversFreq      3.2941
		riversSin       7.5028
		riftsMagn       54.008
		riftsFreq       1.8394
		riftsSin        6.0988
		canyonsMagn     0.46009
		canyonsFreq     0.10119
		canyonsFraction 0.33317
		cracksMagn      0.057556
		cracksFreq      0.093928
		cracksOctaves   0
		craterMagn      0.85372
		craterFreq      0.66924
		craterDensity   0.8036
		craterOctaves   16
		craterRayedFactor 0.15533
		volcanoMagn     0.20398
		volcanoFreq     0.82428
		volcanoDensity  0.17258
		volcanoOctaves  3
		volcanoActivity 0.02575
		volcanoFlows    0.3712
		volcanoRadius   0.14741
		volcanoTemp     179.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.079
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.55830576
		SemiMajorAxisKm 1391609.21
		Eccentricity    0.1
		Inclination     1
		AscendingNode   -178.625954
		ArgOfPericenter 228.091603
		MeanAnomaly     0
	}
}

