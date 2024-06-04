DwarfPlanet	"Des/Lercurnis A III"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            0.00138
	Radius          900
	InertiaMoment   0.398
	Oblateness      0.00109
	RotationPeriod  1.59e+04
	RotationOffset  -90
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0
	TidalLocked		true

	EndogenousHeating 0.55924
	AlbedoBond      0.1
	AlbedoGeom      0.12
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_fragmunt_des.cfg"
		SurfStyle       0.29
		Randomize      (-0.443, 1.756, -0.504)
		colorDistMagn   0.0705
		colorDistFreq   103
		detailScale     64
		drivenDarkening 1
		seaLevel        0.198
		snowLevel       2
		tropicLatitude  0.381
		icecapLatitude  3
		icecapHeight    0.116
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34
		heightTempGrad  0.625
		beachWidth      0.00111
		tropicWidth     0.07
		mainFreq        0.84
		venusFreq       2
		venusMagn       1.15
		mareFreq        1
		mareDensity     1
		terraceProb     0.127
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0343
		dunesFreq       7.43
		dunesFraction   0.331
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      4.44
		riversSin       4.1
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		canyonsMagn     0.526
		canyonsFreq     0.275
		canyonsFraction 0
		cracksMagn      0.0798
		cracksFreq      0.491
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   18
		craterRayedFactor 0
		volcanoMagn     0.187
		volcanoFreq     0.757
		volcanoDensity  0
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.198
		volcanoRadius   0.165
		volcanoTemp     375
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		Period          1.81279448
		SemiMajorAxis   1.3325273
		Eccentricity    0.259541985
		Inclination     -8.24427481
		AscendingNode   -134.656489
		ArgOfPericenter -46.7175573
		MeanAnomaly     0
	}
}

