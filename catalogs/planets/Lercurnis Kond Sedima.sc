Planet	"Sedima/Lercurnis B VI"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            0.24129
	Radius          4204.3
	InertiaMoment   0.32947
	RotationPeriod  749.47
	RotationEpoch   1451545
	Obliquity       1
	EqAscendNode    305.04

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_sedima.cfg"
		SurfStyle       0.92054
		Randomize      (0.901, 0.198, -0.687)
		colorDistMagn   0.077479
		colorDistFreq   398.22
		detailScale     128
		drivenDarkening 0
		seaLevel        0.25954
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.61701
		climatePole     1
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22822
		heightTempGrad  0.375
		beachWidth      0.001026
		tropicWidth     0.5
		mainFreq        1.5
		venusFreq       1.034
		venusMagn       0.45802
		mareFreq        1.9571
		mareDensity     0.16473
		terraceProb     0.20679
		erosion         0
		montesMagn      0.05
		montesFreq      75
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.063365
		dunesFreq       41.389
		dunesFraction   0.11654
		hillsMagn       0.1
		hillsFreq       5
		hillsFraction   1
		hills2Fraction  1
		riversMagn      10
		riversFreq      7.5573
		riversSin       7.3282
		riftsMagn       65.451
		riftsFreq       3.1667
		riftsSin        6.7787
		canyonsMagn     0.026375
		canyonsFreq     115.75
		canyonsFraction 0
		cracksMagn      0.077234
		cracksFreq      0.49075
		cracksOctaves   0
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.43511
		volcanoFreq     2
		volcanoDensity  0.061069
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.33588
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.94637
		cycloneFreq     0.78786
		cycloneDensity  0.38158
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.2222
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          20.922
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.41221
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.39695
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20.922
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.35115
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.39695
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20.922
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.24427
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.39695
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Sedima"
		Height          100
		Density         0.083913
		Pressure        0.1
		Greenhouse      25
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.12825
		SemiMajorAxis   0.109581135
		Eccentricity    0.244274809
		Inclination     1
		AscendingNode   305.038168
		ArgOfPericenter -255.572519
		MeanAnomaly     0
	}
}

