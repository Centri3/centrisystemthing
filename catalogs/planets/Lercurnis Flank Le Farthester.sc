Moon	"Le Farthester/Lercurnis III XIV"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            5.55e-05
	Radius          280
	InertiaMoment   0.398
	RotationPeriod  99.8
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.739 0.736 0.731)

	Surface
	{
		Preset         "aquaria_airless_europa.cfg"
		SurfStyle       0.151
		Randomize      (0.859, 0.598, 0.549)
		colorDistMagn   0.0756
		colorDistFreq   37.6
		detailScale     1.02e+03
		drivenDarkening 0.0119
		seaLevel        0.222
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.759
		icecapHeight    0.0977
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.432
		heightTempGrad  0.625
		beachWidth      0.00116
		tropicWidth     0.07
		mainFreq        1.92
		venusFreq       1.17
		venusMagn       0
		mareFreq        0
		mareDensity     0.177
		terraceProb     0.609
		erosion         0
		montesMagn      0.074
		montesFreq      11
		montesSpiky     0.982
		montesFraction  0.969
		dunesMagn       0.0521
		dunesFreq       2.85
		dunesFraction   0.529
		hillsMagn       0.12
		hillsFreq       34.6
		hillsFraction   0.263
		hills2Fraction  0.0129
		riversMagn      0
		riversFreq      1.78
		riversSin       6.9
		riftsMagn       0
		riftsFreq       2.44
		riftsSin        6.54
		canyonsMagn     0.394
		canyonsFreq     0.0748
		canyonsFraction 0
		cracksMagn      0.0226
		cracksFreq      0.183
		cracksOctaves   0
		craterMagn      0.935
		craterFreq      0.537
		craterDensity   0.956
		craterOctaves   16
		craterRayedFactor 0.149
		volcanoMagn     0.163
		volcanoFreq     0.667
		volcanoDensity  0.132
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.39
		volcanoRadius   0.132
		volcanoTemp     446
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      25165.1869
		SemiMajorAxisKm 72611536.1
		Eccentricity    0.534351145
		Inclination     -162.137405
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

